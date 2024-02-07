package com.example.nineg.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nineg.model.Record
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecordDetailViewModel @Inject constructor() : ViewModel() {

    private val _record = MutableLiveData<Record>()
    val record: LiveData<Record> get() = _record

    fun requestRecordApi() {
        _record.value = Record(
            "https://m.segye.com/content/image/2023/07/06/20230706511066.jpg",
            "타이틀 영역 최대 2줄 작성 가능 고구마 맛탕 참 맛있는뎁 \uD83D\uDC24",
            "",
            "2024년 6월 21일 목요일",
            "자기 개발은 목표를 설정하고 달성하기 위한 여정입니다. 이 블로그 포스트에서는 일상 생활에 쉽게 통합할 수 있는 5가지 핵심 습관을 소개합니다. 첫 번째는 목표 설정과 시간 관리입니다. ",
            3,
        )
    }
}