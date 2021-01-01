package com.example.workmanagerdaggerhilt.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.workmanagerdaggerhilt.di.FamilyModule
import com.example.workmanagerdaggerhilt.model.FamilyInfo

@Dao
interface FamilyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFamilyInfo(model : FamilyInfo)
}