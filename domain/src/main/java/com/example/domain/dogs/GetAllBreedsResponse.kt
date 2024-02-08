package com.example.domain.dogs

import kotlinx.serialization.Serializable

@Serializable
data class GetAllBreedsResponse(
    val message: Message, val status: String
)

@Serializable
data class Message(
    val affenpinscher: List<String>,
    val african: List<String>,
    val airedale: List<String>,
    val akita: List<String>,
    val appenzeller: List<String>,
    val australian: List<String>,
    val bakharwal: List<String>,
    val basenji: List<String>,
    val beagle: List<String>,
    val bluetick: List<String>,
    val borzoi: List<String>,
    val bouvier: List<String>,
    val boxer: List<String>,
    val brabancon: List<String>,
    val briard: List<String>,
    val buhund: List<String>,
    val bulldog: List<String>,
    val bullterrier: List<String>,
    val cattledog: List<String>,
    val cavapoo: List<String>,
    val chihuahua: List<String>,
    val chippiparai: List<String>,
    val chow: List<String>,
    val clumber: List<String>,
    val cockapoo: List<String>,
    val collie: List<String>,
    val coonhound: List<String>,
    val corgi: List<String>,
    val cotondetulear: List<String>,
    val dachshund: List<String>,
    val dalmatian: List<String>,
    val dane: List<String>,
    val deerhound: List<String>,
    val dhole: List<String>,
    val dingo: List<String>,
    val doberman: List<String>,
    val elkhound: List<String>,
    val entlebucher: List<String>,
    val eskimo: List<String>,
    val finnish: List<String>,
    val frise: List<String>,
    val gaddi: List<String>,
    val germanshepherd: List<String>,
    val greyhound: List<String>,
    val groenendael: List<String>,
    val havanese: List<String>,
    val hound: List<String>,
    val husky: List<String>,
    val keeshond: List<String>,
    val kelpie: List<String>,
    val kombai: List<String>,
    val komondor: List<String>,
    val kuvasz: List<String>,
    val labradoodle: List<String>,
    val labrador: List<String>,
    val leonberg: List<String>,
    val lhasa: List<String>,
    val malamute: List<String>,
    val malinois: List<String>,
    val maltese: List<String>,
    val mastiff: List<String>,
    val mexicanhairless: List<String>,
    val mix: List<String>,
    val mountain: List<String>,
    val mudhol: List<String>,
    val newfoundland: List<String>,
    val otterhound: List<String>,
    val ovcharka: List<String>,
    val papillon: List<String>,
    val pariah: List<String>,
    val pekinese: List<String>,
    val pembroke: List<String>,
    val pinscher: List<String>,
    val pitbull: List<String>,
    val pointer: List<String>,
    val pomeranian: List<String>,
    val poodle: List<String>,
    val pug: List<String>,
    val puggle: List<String>,
    val pyrenees: List<String>,
    val rajapalayam: List<String>,
    val redbone: List<String>,
    val retriever: List<String>,
    val ridgeback: List<String>,
    val rottweiler: List<String>,
    val saluki: List<String>,
    val samoyed: List<String>,
    val schipperke: List<String>,
    val schnauzer: List<String>,
    val segugio: List<String>,
    val setter: List<String>,
    val sharpei: List<String>,
    val sheepdog: List<String>,
    val shiba: List<String>,
    val shihtzu: List<String>,
    val spaniel: List<String>,
    val spitz: List<String>,
    val springer: List<String>,
    val stbernard: List<String>,
    val terrier: List<String>,
    val tervuren: List<String>,
    val vizsla: List<String>,
    val waterdog: List<String>,
    val weimaraner: List<String>,
    val whippet: List<String>,
    val wolfhound: List<String>
)