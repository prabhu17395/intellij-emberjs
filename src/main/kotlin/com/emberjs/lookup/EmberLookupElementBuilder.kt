package com.emberjs.lookup

import com.emberjs.icons.EmberIconProvider
import com.emberjs.icons.EmberIcons
import com.emberjs.resolver.EmberName
import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementBuilder

object EmberLookupElementBuilder {
    fun create(it: EmberName, dots: Boolean = true): LookupElement = LookupElementBuilder
            .create(if (dots) it.name.replace("/", ".") else it.name)
            .withTypeText(it.type)
            .withIcon(EmberIconProvider.getIcon(it.type) ?: EmberIcons.EMPTY_16)
            .withCaseSensitivity(true)
}
