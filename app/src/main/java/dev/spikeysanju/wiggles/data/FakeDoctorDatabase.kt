/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.spikeysanju.wiggles.data

import dev.spikeysanju.wiggles.R
import dev.spikeysanju.wiggles.model.Dog
import dev.spikeysanju.wiggles.model.Owner

object FakeDoctorDatabase {
    val owner = Owner("Spikey Sanju", "Developer & Pet Lover", R.drawable.owner)
    val doctorList = listOf(
        Dog(
            0,
            "Иванов Иван",
            45,
            "Мужской",
            "19 лет",
            12.9,
            "389 м",
            R.drawable.male_spec,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            1,
            "Яковлев Михаил Сергеевич",
            39,
            "Мужской",
            "13 лет",
            12.4,
            "412 м",
            R.drawable.male_spec,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            2,
            "Агния Ивановна",
            48,
            "Женский",
            "22 года",
            9.6,
            "879 м",
            R.drawable.female_spec,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            3,
            "Станислав",
            30,
            "Мужской",
            "5 лет",
            8.2,
            "672 м",
            R.drawable.male_spec,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Dog(
            4,
            "Каролина Павловна",
            24,
            "Женский",
            "2 года",
            14.9,
            "982 м",
            R.drawable.female_spec,
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        )
    )
}
