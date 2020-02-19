package com.ketechsoft.belediyemyanimda.util

import android.content.Context
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager


/**     Code with ❤
╔════════════════════════════╗
║  Created by Emre GÖREN     ║
╠════════════════════════════╣
║   emregrnn58@gmail.com     ║
╠════════════════════════════╣
║     19/02/2020 - 20:32     ║
╚════════════════════════════╝
 */

infix fun String.extToastMessage(context: Context) {
    Toast.makeText(context, this, Toast.LENGTH_SHORT).show()
}

fun Fragment.extReplaceTo(viewId: Int, fragmentManager: FragmentManager) {
    fragmentManager.beginTransaction().replace(viewId, this).commit()
}
