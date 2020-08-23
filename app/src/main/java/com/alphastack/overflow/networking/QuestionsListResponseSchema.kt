package com.alphastack.overflow.networking

import com.google.gson.annotations.SerializedName
import com.alphastack.overflow.questions.Question

class QuestionsListResponseSchema(@SerializedName("items") val questions: List<Question>)