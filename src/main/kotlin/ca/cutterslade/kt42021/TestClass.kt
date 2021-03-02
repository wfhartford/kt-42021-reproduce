package ca.cutterslade.kt42021

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class TestClass {
  public fun <T> Flow<T>.newOnEach(action: suspend (T) -> Unit) {
  }

  private fun someAction(elements: List<Elem>) {
  }

  fun function() {
    val someFlow = flow<List<Elem>> {
    }
    someFlow.newOnEach(::someAction)
  }

  class Elem {
  }
}

fun main() {
  TestClass().function()
}