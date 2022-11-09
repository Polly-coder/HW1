package com.data

import android.content.Context
import com.example.hw1.R
import com.model.Country

class DataSourse (val context: Context) {
    fun getCountryName(): Array<String> {
        return context.resources.getStringArray(R.array.country_array)
    }
    fun getCapitalName(): Array<String> {
        return context.resources.getStringArray(R.array.capital_array)
    }

    fun loadCities(): List<Country>{
        val countryList = getCountryName()
        val capitalList = getCapitalName()
        var countries = mutableListOf<Country>()

        for (i in 0..9){
            val country = Country(countryList[i], capitalList[i])
            countries.add(country)
        }
        return countries
    }
}