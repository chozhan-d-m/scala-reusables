package com.idgenerator

class UniqueIDGenerator {
  /** Returns a hash-prefixed compound key. A hash prefix was chosen to help
    * evenly distribute documents across nodes of a hadoop-based data-store,
    * such as mapr-db.
    *
    * @param prefix attribute(s) to hash for the prefix
    * @param body   attribute(s) to append to the prefix
    */
  def hashId(prefix: Seq[String], body: Seq[String]): String = {
    (hashPrefix(prefix) +: body).mkString("~")
  }

  /** Returns a 3 byte md5 hash as a hexadecimal string of 6 chars. Prior to hashing,
    * the input strings are concatenated with no separator character.
    */
  private def hashPrefix(seq: Seq[String]): String = {
    java.security.MessageDigest
      .getInstance("MD5")
      .digest(seq.mkString.getBytes())
      .take(3)
      .foldLeft("")((a, b) => f"$a$b%02x")
  }
}