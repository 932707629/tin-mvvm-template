package me.soushin.tinmvvm

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import me.soushin.tinmvvm.activity.mvvmActivityTemplate
import me.soushin.tinmvvm.fragment.mvvmFragmentTemplate

class SamplePluginTemplateProviderImpl: WizardTemplateProvider() {
    override fun getTemplates(): List<Template> = listOf(
        mvvmActivityTemplate,
        mvvmFragmentTemplate
    )
}