package com.example.workmanagerdaggerhilt.model

import androidx.room.Entity

@Entity
data class FamilyInfo(
    var name : String ,
    var userName : String ,
    var street : String
)