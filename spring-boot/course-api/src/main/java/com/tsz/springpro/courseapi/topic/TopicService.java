/**
 * 
 */
package com.tsz.springpro.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author saurabhshcs
 *
 */

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Java", "Java/J2EE Developer Edition", "Java/J2EE Developer Edition Description"),
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("JS", "Java Script", "Java Script Description")));
	
	public List<Topic> getAllTopic(){
		return topics;
	}

	public Topic getTopic(String topicId) {
		return topics.stream().filter(t-> t.getId().equals(topicId)).findFirst().get();
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		//topics.stream().filter(t->t.getId(id)).mapToObj(i->id[i])).collect(Collectors.toList());
		//This method needs to be done 
	}
	
	public void deleteTopic(final String id) {
		//This method needs to be done 
	}
}
