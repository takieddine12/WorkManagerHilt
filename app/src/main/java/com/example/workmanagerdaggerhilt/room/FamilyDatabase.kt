package com.example.workmanagerdaggerhilt.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.workmanagerdaggerhilt.model.FamilyInfo

@Database(entities = [FamilyInfo::class],version = 1,exportSchema = false)
abstract class FamilyDatabase : RoomDatabase() {

    abstract fun getFamilyInfo() : FamilyDao
}