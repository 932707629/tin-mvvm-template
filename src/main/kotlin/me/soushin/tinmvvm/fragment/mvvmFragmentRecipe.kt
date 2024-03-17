package me.soushin.tinmvvm.fragment

import com.android.tools.idea.wizard.template.Language
import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import me.soushin.tinmvvm.common.repository.mvvmRepositoryJava
import me.soushin.tinmvvm.common.repository.mvvmRepositoryKt
import me.soushin.tinmvvm.common.res.layout.mvvmXml
import me.soushin.tinmvvm.fragment.src.app_package.ui.fragment.mvvmFragmentJava
import me.soushin.tinmvvm.fragment.src.app_package.ui.fragment.mvvmFragmentKt
import me.soushin.tinmvvm.common.viewmodel.mvvmViewModelJava
import me.soushin.tinmvvm.common.viewmodel.mvvmViewModelKt

fun RecipeExecutor.mvvmFragmentRecipe(
    moduleData: ModuleTemplateData,
    fragmentClass: String,
    layoutName: String,
    packageName: String,
    language:Language
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = language.extension//projectData.language.extension
//    generateManifest(
//            moduleData = moduleData,
//            activityClass = "${activityClass}Activity",
//            activityTitle = activityClass,
//            packageName = packageName,
//            isLauncher = false,
//            hasNoActionBar = false,
//            generateActivityTitle = true,
//            requireTheme = false,
//            useMaterial2 = false
//    )
//applicationPackage
    val lowerPkgName = createFileLowerName(fragmentClass)
    if (language==Language.Kotlin){
        val mvvmFragment = mvvmFragmentKt(projectData.applicationPackage, fragmentClass, lowerPkgName, layoutName, packageName)
        // 保存fragment
        save(mvvmFragment, srcOut.resolve("${lowerPkgName}/${fragmentClass}Fragment.${ktOrJavaExt}"))
        // 保存xml
        save(mvvmXml(packageName, fragmentClass,lowerPkgName), resOut.resolve("layout/${layoutName}.xml"))
        // 保存viewmodel
        save(mvvmViewModelKt(packageName, fragmentClass,lowerPkgName), srcOut.resolve("${lowerPkgName}/${fragmentClass}ViewModel.${ktOrJavaExt}"))
//     保存repository
        save(mvvmRepositoryKt(packageName, fragmentClass,lowerPkgName), srcOut.resolve("${lowerPkgName}/${fragmentClass}Repository.${ktOrJavaExt}"))
        //保存Model
        //    save(mvvmModel(packageName, activityClass), srcOut.resolve("model/${activityClass}Model.${ktOrJavaExt}"))

    }else if (language == Language.Java){
        val mvvmFragment = mvvmFragmentJava(projectData.applicationPackage, fragmentClass, lowerPkgName, layoutName, packageName)
        // 保存fragment
        save(mvvmFragment, srcOut.resolve("${lowerPkgName}/${fragmentClass}Fragment.${ktOrJavaExt}"))
        // 保存xml
        save(mvvmXml(packageName, fragmentClass,lowerPkgName), resOut.resolve("layout/${layoutName}.xml"))
        // 保存viewmodel
        save(mvvmViewModelJava(packageName, fragmentClass,lowerPkgName), srcOut.resolve("${lowerPkgName}/${fragmentClass}ViewModel.${ktOrJavaExt}"))
//     保存repository
        save(mvvmRepositoryJava(packageName, fragmentClass, lowerPkgName), srcOut.resolve("${lowerPkgName}/${fragmentClass}Repository.${ktOrJavaExt}"))
        //保存Model
        //    save(mvvmModel(packageName, activityClass), srcOut.resolve("model/${activityClass}Model.${ktOrJavaExt}"))
    }

}
