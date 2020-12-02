package xyz.hisname.fireflyiii.repository.models.bills

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonClass
import java.time.LocalDate

@JsonClass(generateAdapter = true)
@Entity(tableName = "billPaidList",
        foreignKeys = [ForeignKey(entity = BillData::class,
                parentColumns = arrayOf("billId"), childColumns = arrayOf("billPaidId"),
                onDelete = ForeignKey.CASCADE, onUpdate = ForeignKey.CASCADE)])
data class BillPaidDates(
        @PrimaryKey(autoGenerate = true)
        val billPaidId: Long,
        val transaction_group_id: Long,
        val transaction_journal_id: Long,
        val date: LocalDate
)