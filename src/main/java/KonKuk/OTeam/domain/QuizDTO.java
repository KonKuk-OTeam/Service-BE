package KonKuk.OTeam.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QuizDTO {

    private Long id;
    private String question;
    private String answer;
    private String wrongAnswer1;
    private String wrongAnswer2;
    private String wrongAnswer3;
}