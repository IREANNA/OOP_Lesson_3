import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream {
    protected String streamName;
    protected List<StudyGroup> studyGroupList = new ArrayList<>();
    protected int groupsCount=0;

    public Stream(String streamName) {
        this.streamName = streamName;
    }

    public Stream(String streamName, List<StudyGroup> studyGroupList) {
        this.streamName = streamName;
        this.studyGroupList = studyGroupList;
        this.groupsCount = studyGroupList.size();
    }

    public void addGroup(StudyGroup studyGroup) {
        studyGroupList.add(studyGroup);
        groupsCount++;
    }

    public void addGroup(String groupName, List<Student> studentList) {
        studyGroupList.add(new StudyGroup(groupName, studentList));
        groupsCount++;
    }

    public void removeGroup(StudyGroup studyGroup) {
        studyGroupList.remove(studyGroup);
        groupsCount--;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    public List<StudyGroup> getStudyGroupList() {
        return studyGroupList;
    }

    public int getGroupsCount() {
        return groupsCount;
    }

    public String getStreamName() {
        return streamName;
    }

    @Override
    public String toString() {
        return "Поток " + streamName + ": " + studyGroupList;
    }
}