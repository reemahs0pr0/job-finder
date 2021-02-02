package sg.edu.iss.jinder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job")
public class Job {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;	
	private String jobTitle;
	private String companyName;
	@Column(columnDefinition = "TEXT")
	private String jobDesc;
	@Column(columnDefinition = "TEXT")
	private String jobSkills;
	private String jobAppUrl;

	public Job(String jobTitle, String companyName, String jobDesc, String jobSkills, String jobAppUrl) {
		super();
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.jobDesc = jobDesc;
		this.jobSkills = jobSkills;
		this.jobAppUrl = jobAppUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Job [id=" + id + ", jobTitle=" + jobTitle + ", companyName=" + companyName + ", jobDesc=" + jobDesc
				+ ", jobSkills=" + jobSkills + ", jobAppUrl=" + jobAppUrl + "]";
	}
}
