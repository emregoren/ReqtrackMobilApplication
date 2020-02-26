package com.ketechsoft.belediyemyanimda.mock

import com.ketechsoft.belediyemyanimda.model.ComplaintModel


/**     Code with ❤
╔════════════════════════════╗
║  Created by Emre GÖREN ║
╠════════════════════════════╣
║ emregrnn58@gmail.com             ║
╠════════════════════════════╣
║     25/02/2020 - 12:50     ║
╚════════════════════════════╝
 */
object MockList {
    fun getMockedComplainList(): List<ComplaintModel> {
        val complaintModel = ComplaintModel(
            "Sivas meydandaki sokak lambası yanmıyor lütfen gereğini yapınız",
            "Başvurunuz Sonuclanmıştır",
            "25.02.2020 12:55"
        )
        val complaintModel2 = ComplaintModel(
            "Sivas meydandaki çöp konteyneri devrildi. ",
            "Başvurunuz Sonuclanmıştır",
            "26.02.2020 14:57"
        )
        val complaintModel3 = ComplaintModel(
            "Mevlana mahallesinin girişinde su borusu patladı. ",
            "Başvurunuz Sonuclanmıştır",
            "27.02.2020 11:47"
        )

        val complaintList: ArrayList<ComplaintModel> = ArrayList()

        complaintList.add(complaintModel)
        complaintList.add(complaintModel2)
        complaintList.add(complaintModel3)

        return complaintList

    }
}