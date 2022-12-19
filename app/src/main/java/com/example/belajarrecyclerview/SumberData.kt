package com.example.belajarrecyclerview

import java.util.*

class SumberData {
    companion object {

        fun buatsetData() : ArrayList<ListObjRoti>{
            val list = ArrayList<ListObjRoti>()

            list.add(
                ListObjRoti(
                    "Choco Croissant",
                    "Dark chocolate dough and melted chocolate in the middle. ",
                    "https://pcr.ac.id/assets/images/pegawai/WNS20211215072811.JPG",
                    "Rp. 32.000,00"
                )
            )
            list.add(
                ListObjRoti(
                    "Cinnamon Roll",
                    "Laced with spice, and lavished with buttermilk cream cheese icing. ",
                    "https://pcr.ac.id/assets/images/pegawai/MMZ20211215073029.JPG",
                    "Rp. 28.000,00"
                )
            )
            list.add(
                ListObjRoti(
                    "Brioche Loaf",
                    "Buttery soft brioche loaf, perfect for a French toasts. ",
                    "https://pcr.ac.id/assets/images/pegawai/IDI20211215072827.JPG",
                    "Rp. 35.000,00"
                )
            )
            list.add(
                ListObjRoti(
                    "Strawberry Eclair",
                    "Deliciously crisp, puffy and perfect strawberry eclair. ",
                    "https://pcr.ac.id/assets/images/pegawai/SPA20211215072819.JPG",
                    "Rp. 30.000,00"
                )
            )
            list.add(
                ListObjRoti(
                    "Choco Babka Bun",
                    "Soft, gooey, chocolatey heaven! Icing coated chocolate filled buns. ",
                    "https://pcr.ac.id/assets/images/pegawai/MSZ20211215073022.jpg",
                    "Rp. 32.000,00"
                )
            )

            list.add(
                ListObjRoti(
                    "Choco Croissant",
                    "Dark chocolate dough and melted chocolate in the middle. ",
                    "https://pcr.ac.id/assets/images/pegawai/WNS20211215072811.JPG",
                    "Rp. 32.000,00"
                )
            )
return list
        }
    }
}
