package co.zsmb.example

@RequiresOptIn(level = RequiresOptIn.Level.WARNING)
annotation class MyInternalApi

@MyInternalApi
fun internalFun() {}

@MyInternalApi
var internalVar = 0

var otherInternalVar = 0
    @MyInternalApi get
    @MyInternalApi set

@MyInternalApi
var combinedInternalVar = 0
    @MyInternalApi get
    @MyInternalApi set

fun main() {
    internalFun()        // Produces a warning
    internalVar          // Produces a warning
    otherInternalVar     // Does NOT produce a warning
    combinedInternalVar  // Produces a warning
}
