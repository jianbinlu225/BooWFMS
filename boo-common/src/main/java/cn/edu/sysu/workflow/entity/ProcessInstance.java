package cn.edu.sysu.workflow.entity;

import cn.edu.sysu.workflow.entity.base.BooPagedQuery;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * Business Process Instance of BooWFMS
 *
 * Created by Skye on 2019/12/18.
 */
public class ProcessInstance extends BooPagedQuery {

    private static final long serialVersionUID = -1926465135408134380L;
    private final String PREFIX = "pi-";

    /**
     * 流程实例ID
     */
    private String processInstanceId;

    /**
     * 所属流程ID
     */
    private String processId;

    /**
     * 提交运行账户ID
     */
    private String launchAccountId;

    /**
     * 提交运行方式
     */
    private String launchMethod;

    /**
     * 提交运行类型
     */
    private Integer launchType;

    /**
     * 运行引擎ID
     */
    private String engineId;

    /**
     * 资源服务ID
     */
    private String resourceId;

    /**
     * TODO 绑定的静态资源（保留）
     */
    private String resourceBinding;

    /**
     * TODO 资源绑定类型（0-业务角色映射，1-静态绑定）
     */
    private Integer resourceBindingType;

    /**
     * TODO 失败类型（0-快速失败，1-尝试继续执行）
     */
    private Integer failureType;

    /**
     * 流程实例参与者缓存
     */
    private List<String> participantCache;

    /**
     * 提交运行时间戳
     */
    private Timestamp launchTimestamp;

    /**
     * 完成时间戳
     */
    private Timestamp finishTimestamp;

    /**
     * 结果类型（-1-失败，0-未定，1-成功）
     */
    private int resultType;

    /**
     * 附加信息
     */
    private Map<String, String> tag;


    public ProcessInstance() {
        this.processInstanceId = PREFIX + UUID.randomUUID().toString();
    }

    public String getPREFIX() {
        return PREFIX;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getLaunchAccountId() {
        return launchAccountId;
    }

    public void setLaunchAccountId(String launchAccountId) {
        this.launchAccountId = launchAccountId;
    }

    public String getLaunchMethod() {
        return launchMethod;
    }

    public void setLaunchMethod(String launchMethod) {
        this.launchMethod = launchMethod;
    }

    public Integer getLaunchType() {
        return launchType;
    }

    public void setLaunchType(Integer launchType) {
        this.launchType = launchType;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceBinding() {
        return resourceBinding;
    }

    public void setResourceBinding(String resourceBinding) {
        this.resourceBinding = resourceBinding;
    }

    public Integer getResourceBindingType() {
        return resourceBindingType;
    }

    public void setResourceBindingType(Integer resourceBindingType) {
        this.resourceBindingType = resourceBindingType;
    }

    public Integer getFailureType() {
        return failureType;
    }

    public void setFailureType(Integer failureType) {
        this.failureType = failureType;
    }

    public List<String> getParticipantCache() {
        return participantCache;
    }

    public void setParticipantCache(List<String> participantCache) {
        this.participantCache = participantCache;
    }

    public Timestamp getLaunchTimestamp() {
        return launchTimestamp;
    }

    public void setLaunchTimestamp(Timestamp launchTimestamp) {
        this.launchTimestamp = launchTimestamp;
    }

    public Timestamp getFinishTimestamp() {
        return finishTimestamp;
    }

    public void setFinishTimestamp(Timestamp finishTimestamp) {
        this.finishTimestamp = finishTimestamp;
    }

    public int getResultType() {
        return resultType;
    }

    public void setResultType(int resultType) {
        this.resultType = resultType;
    }

    public Map<String, String> getTag() {
        return tag;
    }

    public void setTag(Map<String, String> tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessInstance that = (ProcessInstance) o;
        return resultType == that.resultType &&
                Objects.equals(processInstanceId, that.processInstanceId) &&
                Objects.equals(processId, that.processId) &&
                Objects.equals(launchAccountId, that.launchAccountId) &&
                Objects.equals(launchMethod, that.launchMethod) &&
                Objects.equals(launchType, that.launchType) &&
                Objects.equals(engineId, that.engineId) &&
                Objects.equals(resourceId, that.resourceId) &&
                Objects.equals(resourceBinding, that.resourceBinding) &&
                Objects.equals(resourceBindingType, that.resourceBindingType) &&
                Objects.equals(failureType, that.failureType) &&
                Objects.equals(participantCache, that.participantCache) &&
                Objects.equals(launchTimestamp, that.launchTimestamp) &&
                Objects.equals(finishTimestamp, that.finishTimestamp) &&
                Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processInstanceId, processId, launchAccountId, launchMethod, launchType, engineId, resourceId, resourceBinding, resourceBindingType, failureType, participantCache, launchTimestamp, finishTimestamp, resultType, tag);
    }
}