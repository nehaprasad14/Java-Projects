package cdac.action;

import java.util.List;
import java.util.Map;

import org.apache.catalina.core.ApplicationContext;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Query;
import org.hibernate.Session;

import cdac.hbm.HibernateUtil;
import cdac.model.DataModel;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AdminAction extends ActionSupport 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String execute()
	{
		Session hibernatesession = HibernateUtil.getSession();
		hibernatesession.beginTransaction();
		//report 1
		String hql1 = "SELECT distinct E.userId FROM cdac.model.DataModel E";
		
		//report 2
		String hex = "select count(E.userId) from cdac.model.DataModel E where E.section = 'ex'";
		String hintro = "select count(E.userId) from cdac.model.DataModel E where E.section = 'intro'";
		String hdef = "select count(E.userId) from cdac.model.DataModel E where E.section = 'def'";
		String hsummary = "select count(E.userId) from cdac.model.DataModel E where E.section = 'summary'";
		String hassign = "select count(E.userId) from cdac.model.DataModel E where E.section = 'assign'";
		String himg1 = "select count(E.userId) from cdac.model.DataModel E where E.section = 'img1'";
		String haudio = "select count(E.userId) from cdac.model.DataModel E where E.section = 'audio'";
		String hvideo = "select count(E.userId) from cdac.model.DataModel E where E.section = 'video'";
		
		//report 3
		String ch1 = "select count(E.userId) from cdac.model.DataModel E where E.chapter = 'CH01'";
		String ch2 = "select count(E.userId) from cdac.model.DataModel E where E.chapter = 'CH02'";
		
		
		Query query1 =hibernatesession.createQuery(hql1);
		
		Query qex =hibernatesession.createQuery(hex);
		Query qintro =hibernatesession.createQuery(hintro);
		Query qdef =hibernatesession.createQuery(hdef);
		Query qsummary =hibernatesession.createQuery(hsummary);
		Query qassign =hibernatesession.createQuery(hassign);
		Query qimg1 =hibernatesession.createQuery(himg1);
		Query qaudio =hibernatesession.createQuery(haudio);
		Query qvideo =hibernatesession.createQuery(hvideo);
		
		Query qch1 =hibernatesession.createQuery(ch1);
		Query qch2 =hibernatesession.createQuery(ch2);
		
		
		List results1 = query1.list();
		List rex = qex.list();		
		List rintro = qintro.list();
		List rdef = qdef.list();
		List rsummary = qsummary.list();
		List rassign = qassign.list();
		List rimg1 = qimg1.list();
		List raudio = qaudio.list();
		List rvideo = qvideo.list();
		
		List rch1 = qch1.list();
		List rch2 = qch2.list();
		
		//report3
		/*String hql = "select * from cdac.model.DataModel E where E.section = 'video'";
		Query createQuery = hibernatesession.createQuery(hql);
		List<DataModel> list = createQuery.list();	
		*/
		
		Map sess = ActionContext.getContext().getSession();
		sess.put("list1", results1);
		
		sess.put("lex", rex);
		sess.put("lintro", rintro);
		sess.put("ldef", rdef);
		sess.put("lsummary", rsummary);
		sess.put("lassign", rassign);
		sess.put("limg1", rimg1);
		sess.put("laudio", raudio);
		sess.put("lvideo", rvideo);
		
		sess.put("lch1", rch1);
		sess.put("lch2", rch2);
		
		
			
		
		return SUCCESS;
		
		/*public Book getByID(Integer id){                                                          
		    Query query = getSession().createQuery("FROM Book WHERE bookId = :id");               
		    query.setParameter("id", id);                                                         
		    return (Book) query.uniqueResult();                                                   
		}*/
		
		
	}
}
