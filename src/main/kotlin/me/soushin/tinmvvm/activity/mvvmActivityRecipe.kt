package me.soushin.tinmvvm.activity

import com.android.tools.idea.wizard.template.Language
import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.generateManifest
import me.soushin.tinmvvm.activity.src.app_package.ui.mvvmActivityJava
import me.soushin.tinmvvm.activity.src.app_package.ui.mvvmActivityKt
import me.soushin.tinmvvm.common.repository.mvvmRepositoryJava
import me.soushin.tinmvvm.common.repository.mvvmRepositoryKt
import me.soushin.tinmvvm.common.res.layout.mvvmXml
import me.soushin.tinmvvm.common.viewmodel.mvvmViewModelJava
import me.soushin.tinmvvm.common.viewmodel.mvvmViewModelKt
import me.soushin.tinmvvm.fragment.createFileLowerName
import java.io.File

fun RecipeExecutor.mvvmActivityRecipe(
    moduleData: ModuleTemplateData,
    activityClass: String,
    layoutName: String,
    packageName: String,
    language: Language
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = language.extension//projectData.language.extension
    val lowerPkgName = createFileLowerName(activityClass)

    if (language == Language.Kotlin){
        //applicationPackage
        val mvvmActivity = mvvmActivityKt(projectData.applicationPackage, activityClass, lowerPkgName, layoutName, packageName)
        // 保存Activity
        save(mvvmActivity, srcOut.resolve("${lowerPkgName}/${activityClass}Activity.${ktOrJavaExt}"))
        // 保存xml
        save(mvvmXml(packageName, activityClass, lowerPkgName), resOut.resolve("layout/${layoutName}.xml"))
        // 保存viewmodel
        save(mvvmViewModelKt(packageName, activityClass, lowerPkgName), srcOut.resolve("${lowerPkgName}/${activityClass}ViewModel.${ktOrJavaExt}"))
        // 保存repository
        save(mvvmRepositoryKt(packageName, activityClass, lowerPkgName), srcOut.resolve("${lowerPkgName}/${activityClass}Repository.${ktOrJavaExt}"))
        //保存model
//    save(mvvmModel(packageName, activityClass), srcOut.resolve("model/${activityClass}Model.${ktOrJavaExt}"))
    }else if (language == Language.Java){
        //applicationPackage
        val mvvmActivity = mvvmActivityJava(projectData.applicationPackage, activityClass, lowerPkgName, layoutName, packageName)
        // 保存Activity
        save(mvvmActivity, srcOut.resolve("${lowerPkgName}/${activityClass}Activity.${ktOrJavaExt}"))
        // 保存xml
        save(mvvmXml(packageName, activityClass, lowerPkgName), resOut.resolve("layout/${layoutName}.xml"))
        // 保存viewmodel
        save(mvvmViewModelJava(packageName, activityClass, lowerPkgName), srcOut.resolve("${lowerPkgName}/${activityClass}ViewModel.${ktOrJavaExt}"))
        // 保存repository
        save(mvvmRepositoryJava(packageName, activityClass, lowerPkgName), srcOut.resolve("${lowerPkgName}/${activityClass}Repository.${ktOrJavaExt}"))
        //保存model
//    save(mvvmModel(packageName, activityClass), srcOut.resolve("model/${activityClass}Model.${ktOrJavaExt}"))
    }

//    generateManifest(
//        moduleData = moduleData,
//        activityClass = "${activityClass}Activity",
////            activityTitle = activityClass,
//        packageName = "$packageName.ui",
//        isLauncher = false,
//        hasNoActionBar = false,
//        activityThemeName = "",
//        isNewModule = false,
//        isLibrary = false,
//        manifestOut = null,
//        generateActivityTitle = true,
//        isResizeable = false,
//        libraryName = "",
////            requireTheme = false,
////            useMaterial2 = false
////            isResizeable = false
//    )


}
