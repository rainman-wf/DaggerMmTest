package ru.netology.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import ru.netology.presentation.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var mainViewModel: MainViewModel

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val presentationComponent = (applicationContext as PresentationComponentProvider).providePresentationComponent()

        presentationComponent.inject(this)

        mainViewModel.setData()

        mainViewModel.data.observe(this) {
            Log.d("TAG", "onCreate: $it")
            binding.text.text = it.data
        }
    }
}