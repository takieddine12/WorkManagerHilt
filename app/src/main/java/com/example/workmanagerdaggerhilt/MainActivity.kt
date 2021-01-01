package com.example.workmanagerdaggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.solver.state.State
import androidx.work.Constraints
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.example.workmanagerdaggerhilt.workmanager.ExampleWorker
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setWorker.setOnClickListener {

            val constraint = Constraints.Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .setRequiresCharging(false)
                .build()

            val oneTimeWorkRequest = OneTimeWorkRequest.Builder(ExampleWorker::class.java)
                .setConstraints(constraint)
                .build()

            var request = WorkManager.getInstance(this)
                .enqueue(oneTimeWorkRequest)


        }
    }
}