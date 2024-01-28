package com.example.homework16

import com.google.gson.annotations.SerializedName

data class ApiResponse(val heroes: List<Hero>)

data class Hero(
    @SerializedName("id") var id: Int,
    @SerializedName("name") var name: String,
    @SerializedName("slug") var slug: String,
    @SerializedName("powerstats") var powerstats: Powerstats,
    @SerializedName("appearance") var appearance: Appearance,
    @SerializedName("biography") var biography: Biography,
    @SerializedName("work") var work: Work,
    @SerializedName("connections") var connections: Connections,
    @SerializedName("images") var images: Images
)

data class Powerstats(
    @SerializedName("intelligence") var intelligence: String,
    @SerializedName("strength") var strength: String,
    @SerializedName("speed") var speed: String,
    @SerializedName("durability") var durability: String,
    @SerializedName("power") var power: String,
    @SerializedName("combat") var combat: String
)

data class Appearance(
    @SerializedName("gender") var gender: String,
    @SerializedName("race") var race: String,
    @SerializedName("height") var height: ArrayList<String>,
    @SerializedName("weight") var weight: ArrayList<String>,
    @SerializedName("eyeColor") var eyeColor: String,
    @SerializedName("hairColor") var hairColor: String
)

data class Biography(
    @SerializedName("fullName") var fullName: String,
    @SerializedName("alterEgos") var alterEgos: String,
    @SerializedName("aliases") var aliases: ArrayList<String>,
    @SerializedName("placeOfBirth") var placeOfBirth: String,
    @SerializedName("firstAppearance") var firstAppearance: String,
    @SerializedName("publisher") var publisher: String,
    @SerializedName("alignment") var alignment: String
)

data class Work(
    @SerializedName("occupation") var occupation: String,
    @SerializedName("base") var base: String
)

data class Connections(
    @SerializedName("groupAffiliation") var groupAffiliation: String,
    @SerializedName("relatives") var relatives: String
)

data class Images(
    @SerializedName("xs") var xs: String,
    @SerializedName("sm") var sm: String,
    @SerializedName("md") var md: String,
    @SerializedName("lg") var lg: String
)