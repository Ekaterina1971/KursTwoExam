package org.skypro.examiner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skypro.examiner.exception.NotEnoughQuestionException;
import org.skypro.examiner.service.ExaminerServiceImpl;
import org.skypro.examiner.service.JavaQuestionService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.skypro.examiner.Constants.*;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {
    @Mock
    private JavaQuestionService questionService;

    @InjectMocks
    private ExaminerServiceImpl examinerServiceOut;

    public static Stream<Arguments> amountQuestionVariations() {
        return Stream.of(Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 3),
                Arguments.of(4, 4));
    }
    @ParameterizedTest
    @MethodSource("amountQuestionVariations")
    void getQuestionAmountVerify(int amount, int expected) {
        when(questionService.getAll()).thenReturn(TEST_QUESTION_SET1);
        when(questionService.getRandomQuestion()).thenReturn(FULL_QUESTION_1,FULL_QUESTION_2,FULL_QUESTION_3,FULL_QUESTION_4);
        assertEquals(expected, examinerServiceOut.getQuestions(amount).size());
    }


    @Test
    void getQuestionAmountQuestionFullExceptionVerify() {
        when(questionService.getAll()).thenReturn(TEST_QUESTION_SET1);
        Assertions.assertThrows(NotEnoughQuestionException.class, () -> examinerServiceOut.getQuestions(11));
    }

    @Test
    void getQuestionAmountQuestionNullExceptionVerify() {
        when(questionService.getAll()).thenReturn(TEST_QUESTION_SET1);
        Assertions.assertThrows(NotEnoughQuestionException.class, () -> examinerServiceOut.getQuestions(0));
    }



}
