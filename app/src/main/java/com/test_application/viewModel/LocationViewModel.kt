package com.test_application.viewModel

import android.os.Handler
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test_application.api.LocationObject
import com.test_application.api.RetrofitInstance
import com.test_application.model.Location
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.test_application.model.Result

class LocationViewModel : ViewModel() {
    private var movieLiveData = MutableLiveData<LocationObject>()
    fun getPopularMovies() {
        RetrofitInstance.api.getPopularMovies("4dd79c02aff94ebab1a190013232512","New Delhi").enqueue(object  :
            Callback<Location> {
            override fun onResponse(call: Call<Location>, response: Response<Location>) {
                if (response.body()!=null){
                    movieLiveData.value = response.body()!!.location
                }
                else{
                    return
                }
            }
            override fun onFailure(call: Call<Location>, t: Throwable) {
                Log.d("TAG",t.message.toString())
            }
        })
    }
    fun observeMovieLiveData() : LiveData<LocationObject> {
        return movieLiveData
    }
}