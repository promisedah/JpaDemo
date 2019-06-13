package cn.org.yunmo.hotel.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SysForget {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer sys_user_id;

    private String question;

    private String answer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSys_user_id() {
        return sys_user_id;
    }

    public void setSys_user_id(Integer sys_user_id) {
        this.sys_user_id = sys_user_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question == null ? null : question.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }
}