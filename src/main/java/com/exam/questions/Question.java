package com.exam.questions;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.json.simple.JSONObject;;
@Entity
@Table(name = "questions", schema="exams")
public class Question implements Serializable {
	/**
	 * 
	 */
	// Sample comment
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "subject")
	private String subject;
	@Column(name = "statement")
	private String statement;
	@Column(name = "options")
	private transient JSONObject options;
	@Column(name = "level")
	private String level;
	@Column(name = "weekid")
	private Integer weekid;
	@Column(name = "status")
	private String status;
	@Column(name = "Key")
	private Character key;
	public Question() {}
	public Question(Long id, String subject, String statement, JSONObject options, String level,
			Integer weekid, String status, Character key) {
		super();
		this.id = id;
		this.subject = subject;
		this.statement = statement;
		this.options = options;
		this.level = level;
		this.weekid = weekid;
		this.status = status;
		this.key = key;
	}
	
	public Long getId() {
		return id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStatement() {
		return statement;
	}
	public void setStatement(String statement) {
		this.statement = statement;
	}
	public JSONObject getOptions() {
		return options;
	}
	public void setOptions(JSONObject options) {
		
		this.options = options;
	}
	/*
	private Map<String, String> toMap(JSONObject options) {
	       Map<String, String> map = new HashMap<String, String>();

	        Iterator<String> keysItr = options.keySet().iterator();
	        while(keysItr.hasNext()) {
	            String key = keysItr.next();
	            String value = (String) options.get(key);
	            map.put(key, value);
	        }
	        return map;
	}
	*/
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Integer getWeekid() {
		return weekid;
	}
	public void setWeekid(Integer weekid) {
		this.weekid = weekid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Character getKey() {
		return key;
	}
	public void setKey(Character key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", subject=" + subject + ", statement=" + statement + ", options=" + options
				+ ", level=" + level + ", weekid=" + weekid + ", status=" + status + ", key=" + key + "]";
	}
}
