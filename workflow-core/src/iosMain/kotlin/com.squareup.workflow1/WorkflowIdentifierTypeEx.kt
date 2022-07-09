package com.squareup.workflow1

import kotlin.reflect.KClass

public actual object WorkflowIdentifierTypeHelper {
  public actual fun uniqueName(kClass: KClass<*>): String {
    return kClass.qualifiedName ?: kClass.toString()
  }
}
