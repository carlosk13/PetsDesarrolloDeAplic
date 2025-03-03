package edu.itvo.pets.data.model


import com.google.gson.annotations.SerializedName

data class PetResponse(
    @SerializedName("success")
    var success: Boolean,

    @SerializedName("message")
    var message: String,

    @SerializedName("data")
    var data: List<PetModel>
)