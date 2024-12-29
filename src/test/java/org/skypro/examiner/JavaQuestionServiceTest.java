package org.skypro.examiner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.skypro.examiner.service.JavaQuestionService;

import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.skypro.examiner.Constants.*;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {
    private final JavaQuestionService out = new JavaQuestionService();
    @Test
    void addQuestion(){
        out.add(QUESTION_1, ANSWER_1);
        assertTrue(out.getAll().contains(FULL_QUESTION_1));
    }
    @Test
    void removeQuestion(){
        out.remove(QUESTION_1, ANSWER_1);
        assertFalse(out.getAll().contains(FULL_QUESTION_1));
    }
    @Test
    void getAll(){
        out.add(QUESTION_1, ANSWER_1);
        out.add(QUESTION_2, ANSWER_2);
        out.add(QUESTION_3, ANSWER_3);
        out.add(QUESTION_4, ANSWER_4);
        assertTrue(out.getAll().containsAll(List.of(FULL_QUESTION_1,FULL_QUESTION_2,FULL_QUESTION_3,FULL_QUESTION_4)));
    }
    @Test
    void getRandomQuestion(){
        out.add(QUESTION_1, ANSWER_1);
        out.add(QUESTION_2, ANSWER_2);
        out.add(QUESTION_3, ANSWER_3);
        out.add(QUESTION_4, ANSWER_4);
        Random random = mock(Random.class, withSettings().withoutAnnotations());
        when(random.nextInt(anyInt())).thenReturn(2);
        out.setRandom(random);
        assertEquals(FULL_QUESTION_2, out.getRandomQuestion());
    }
}
