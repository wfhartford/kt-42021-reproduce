package ca.cutterslade.kt42021

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onEach

class SmallerTestClass {
  private fun someAction(elements: String) {}
  fun function(flow: Flow<String>) {
    flow.onEach(::someAction)
  }
}