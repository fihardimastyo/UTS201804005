package com.example.uts201804005

object Datadiri2 {
    private val namaorang = arrayOf(
        "Fihar Dimastyo ",
        "Firmadiyanti Atha Shahirah",
        "Poniman",
        "Titik Mulyati",
        "Ariana Grande",
        "Chester Bennington",
        "Mike Shinoda",
        "Nikola Tesla",
        "Avicii",
        "Niles Hollowell-Dhar (KSHMR)",
        "Ava Max",
        "Anne Marie",
        "David Guetta",
        "Katy Perry",
        "Alan Walker",
        "Rihanna",
        "Eminem",
        "Sia",
        "Adam Levine",
        "Sam Smith"

    )
    private val alamatorang = arrayOf(
        "Purwakarta",
        "Purwakarta",
        "Purwakarta",
        "Purwakarta",
        "Florida",
        "California",
        "Lost Angeles",
        "New York",
        "Swedia",
        "California",
        "Wisconsin",
        "Essex",
        "Paris",
        "California",
        "Norwegia",
        "Saint Michael",
        "Detroit",
        "Australia",
        "Los Angeles",
        "London"
    )
    private val nomorhp = arrayOf(
        "+62 813-1930-7729",
        "+62 813-1402-7053",
        "+62 878-7961-8189",
        "+62 812-2487-198",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789",
        "123456789"
    )
    private val gambarsaya = intArrayOf(
        R.drawable.fihar,
        R.drawable.dede,
        R.drawable.abi,
        R.drawable.umi,
        R.drawable.ariana,
        R.drawable.chester,
        R.drawable.mike,
        R.drawable.tesla,
        R.drawable.avicii,
        R.drawable.kshmr,
        R.drawable.ava,
        R.drawable.anne,
        R.drawable.david,
        R.drawable.katy,
        R.drawable.alan,
        R.drawable.rihanna,
        R.drawable.eminem,
        R.drawable.sia,
        R.drawable.adam,
        R.drawable.sam











    )
    val listData: ArrayList<Datadiri>
        get() {
            val listDatadiri = arrayListOf<Datadiri>()
            for (position in namaorang.indices){
                val data = Datadiri()
                data.nama = namaorang[position]
                data.alamat = alamatorang[position]
                data.nomor = nomorhp[position]
                data.gambar = gambarsaya[position]
                listDatadiri.add(data)
            }
            return listDatadiri
        }
}