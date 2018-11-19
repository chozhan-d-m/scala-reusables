package com.idgenerator

object Main extends App{
  /** Demonstrates the usage of UniqueIDGenerator class
    *
    * @param sku some product attribute
    * @param productType some product attribute
    * @param assignmentID some product attribute
    */
  val sku ="15078"
  val productType = "ItemMaster"
  val assignmentID = "10233"
  val uniqueID = new UniqueIDGenerator().hashId(Seq(sku,assignmentID),Seq(assignmentID))
  println(uniqueID)
}
