package com.example.workmanagerdaggerhilt.workmanager

import android.content.Context
import androidx.hilt.work.WorkerInject
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.workmanagerdaggerhilt.di.FamilyModule
import com.example.workmanagerdaggerhilt.model.FamilyInfo
import com.example.workmanagerdaggerhilt.room.FamilyDao
import java.lang.Exception

class ExampleWorker @WorkerInject constructor(
    var familyDao: FamilyDao,
    context: Context,
    workerParameters: WorkerParameters
) : Worker(context,workerParameters) {

    override fun doWork(): Result {
      return try {
          val model  = FamilyInfo("Taki","Gastalli","Rue de larmonte")
          familyDao.insertFamilyInfo(model)
          Result.success()
      }catch (ex : Exception){
          Result.failure()
      }
    }
}