package com.example.simplecleanarchitecture.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.domain.model.PersonDTO
import com.example.simplecleanarchitecture.R
import com.example.simplecleanarchitecture.databinding.ActivityMainBinding
import com.example.simplecleanarchitecture.ui.adapter.ListItemAdapter
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var viewDataBinding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(viewDataBinding.root)

      // viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // get data from view model
        val personList = viewModel.getPersonList()
        // set data to adapter
        val adapter = ListItemAdapter(personList)
        viewDataBinding.recyclerView.adapter = adapter
        // set click listener
        adapter.onItemClickListener = object : ListItemAdapter.OnItemClickListener {
            override fun onItemClick(position: Int, person: PersonDTO) {
                Toast.makeText(this@MainActivity, "Job is  : ${person.job}", Toast.LENGTH_SHORT).show()
            }
        }
    }

}