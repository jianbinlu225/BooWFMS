package cn.edu.sysu.workflow.common.entity;

import cn.edu.sysu.workflow.common.entity.base.BooPagedQuery;

import java.util.Objects;

/**
 * TaskItem (deserialize from model) of BooWFMS.
 *
 * @author Skye
 * Created on 2019/12/24
 */
public class TaskItem extends BooPagedQuery {

    private static final long serialVersionUID = 982206185945701947L;
    public static final String PREFIX = "ti-";

    /**
     * 数据库主键
     */
    private String taskItemId;

    /**
     * 业务对象ID
     */
    private String businessObjectId;

    /**
     * 来源任务的模型名
     */
    private String taskPolymorphismName;

    /**
     * 来源任务的模型ID
     */
    private String taskPolymorphismId;

    /**
     * 涉及业务角色
     */
    private String businessRole;

    /**
     * TODO
     */
    private String principle;

    /**
     * TODO
     */
    private String eventDescriptor;

    /**
     * TODO
     */
    private String hookDescriptor;

    /**
     * TODO
     */
    private String documentation;

    /**
     * 参数
     */
    private String parameters;

    public TaskItem() {
        super();
    }

    public String getTaskItemId() {
        return taskItemId;
    }

    public void setTaskItemId(String taskItemId) {
        this.taskItemId = taskItemId;
    }

    public String getBusinessObjectId() {
        return businessObjectId;
    }

    public void setBusinessObjectId(String businessObjectId) {
        this.businessObjectId = businessObjectId;
    }

    public String getTaskPolymorphismName() {
        return taskPolymorphismName;
    }

    public void setTaskPolymorphismName(String taskPolymorphismName) {
        this.taskPolymorphismName = taskPolymorphismName;
    }

    public String getTaskPolymorphismId() {
        return taskPolymorphismId;
    }

    public void setTaskPolymorphismId(String taskPolymorphismId) {
        this.taskPolymorphismId = taskPolymorphismId;
    }

    public String getBusinessRole() {
        return businessRole;
    }

    public void setBusinessRole(String businessRole) {
        this.businessRole = businessRole;
    }

    public String getPrinciple() {
        return principle;
    }

    public void setPrinciple(String principle) {
        this.principle = principle;
    }

    public String getEventDescriptor() {
        return eventDescriptor;
    }

    public void setEventDescriptor(String eventDescriptor) {
        this.eventDescriptor = eventDescriptor;
    }

    public String getHookDescriptor() {
        return hookDescriptor;
    }

    public void setHookDescriptor(String hookDescriptor) {
        this.hookDescriptor = hookDescriptor;
    }

    public String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskItem taskItem = (TaskItem) o;
        return Objects.equals(taskItemId, taskItem.taskItemId) &&
                Objects.equals(businessObjectId, taskItem.businessObjectId) &&
                Objects.equals(taskPolymorphismName, taskItem.taskPolymorphismName) &&
                Objects.equals(taskPolymorphismId, taskItem.taskPolymorphismId) &&
                Objects.equals(businessRole, taskItem.businessRole) &&
                Objects.equals(principle, taskItem.principle) &&
                Objects.equals(eventDescriptor, taskItem.eventDescriptor) &&
                Objects.equals(hookDescriptor, taskItem.hookDescriptor) &&
                Objects.equals(documentation, taskItem.documentation) &&
                Objects.equals(parameters, taskItem.parameters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskItemId, businessObjectId, taskPolymorphismName, taskPolymorphismId, businessRole, principle, eventDescriptor, hookDescriptor, documentation, parameters);
    }
}