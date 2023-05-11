package com.example.eigthpractice.data

import com.example.eigthpractice.R
import java.net.URL

object Repository {
    val subjects = listOf<Subject>(
        Subject( // Russian
            "Russian", R.drawable.russian_icon, listOf(
                Variant(1, "https://rus-ege.sdamgia.ru/test?id=34731190"),
                Variant(2, "https://rus-ege.sdamgia.ru/test?id=34731191"),
                Variant(3, "https://rus-ege.sdamgia.ru/test?id=34731192")
            )
        ),
        Subject(
            "Math", R.drawable.math_icon, listOf(
                Variant(1, "https://math-ege.sdamgia.ru/test?id=52049181"),
                Variant(2, "https://math-ege.sdamgia.ru/test?id=52049182"),
                Variant(3, "https://math-ege.sdamgia.ru/test?id=52049183")
            )
        ),
        Subject(
            "Informatics", R.drawable.informatics_icon, listOf(
                Variant(1, "https://inf-ege.sdamgia.ru/test?id=12862425"),
                Variant(2, "https://inf-ege.sdamgia.ru/test?id=12862426"),
                Variant(3, "https://inf-ege.sdamgia.ru/test?id=12862427")
            )
        )
    )
}