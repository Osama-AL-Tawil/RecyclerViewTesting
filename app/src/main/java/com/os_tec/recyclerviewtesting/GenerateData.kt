package com.os_tec.recyclerviewtesting

class GenerateData {

    fun rcItem():ArrayList<Int>{
        val data=ArrayList<Int>()
        for ( i in 1 .. 20){
            data.add(i)
        }
        return data
    }

}