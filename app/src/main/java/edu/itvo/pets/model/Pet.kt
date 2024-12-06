 package edu.itvo.pets.model

import java.util.*

data class Pet(val id:Int,
                val name:String,
                 val race:String,
                  val species:String,
                    val description:String,
                      val birthDate:Date,
                        val image: String)
