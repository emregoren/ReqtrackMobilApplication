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
            "sdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff",
            "başvurunuz sonuclanmıştır",
            "25.02.2020 12:55"
        )

        val complaintList: ArrayList<ComplaintModel> = ArrayList()

        complaintList.add(complaintModel)
        complaintList.add(complaintModel)
        complaintList.add(complaintModel)
        complaintList.add(complaintModel)
        complaintList.add(complaintModel)
        complaintList.add(complaintModel)
        complaintList.add(complaintModel)
        complaintList.add(complaintModel)
        complaintList.add(complaintModel)
        complaintList.add(complaintModel)
        complaintList.add(complaintModel)
        complaintList.add(complaintModel)

        return complaintList

    }
}