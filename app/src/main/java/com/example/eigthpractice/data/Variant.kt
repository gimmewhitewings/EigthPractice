package com.example.eigthpractice.data

import android.os.Parcel
import android.os.Parcelable
import java.net.URL

data class Variant(val number: Int, val url: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(number)
        parcel.writeString(url)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Variant> {
        override fun createFromParcel(parcel: Parcel): Variant {
            return Variant(parcel.readInt(), parcel.readString()!!)
        }

        override fun newArray(size: Int): Array<Variant?> {
            return arrayOfNulls(size)
        }
    }
}
