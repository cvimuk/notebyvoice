package com.ppai.voicetotask.data.local.entities

import androidx.room.Embedded
import androidx.room.Relation

data class NoteWithTasks(
    @Embedded val note: NoteEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "noteId"
    )
    val tasks: List<TaskEntity>
)