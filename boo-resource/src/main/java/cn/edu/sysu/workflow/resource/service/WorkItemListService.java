package cn.edu.sysu.workflow.resource.service;

import cn.edu.sysu.workflow.common.entity.WorkItemList;
import cn.edu.sysu.workflow.common.enums.WorkItemListType;
import cn.edu.sysu.workflow.resource.core.context.WorkItemContext;

import java.util.List;

/**
 * 工作项列表管理服务
 *
 * @author Skye
 * Created on 2020/3/14
 */
public interface WorkItemListService {

    /**
     * 根据所有者账户Id和类型查找工作项列表，若为空则创建
     *
     * @param ownerAccountId 所有者账户Id
     * @param type           工作项列表类型
     * @return
     */
    WorkItemList findByOwnerAccountIdAndType(String ownerAccountId, WorkItemListType type);

    /**
     * Move work item list: OFFERED -> ALLOCATED
     *
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param workItemContext work item context
     */
    void moveFromOfferedToAllocated(WorkItemContext workItemContext, String ownerAccountId);

    /**
     * Move work item list: ALLOCATED -> OFFERED
     *
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param workItemContext work item context
     */
    void moveFromAllocatedToOffered(WorkItemContext workItemContext, String ownerAccountId);

    /**
     * Move work item list: OFFERED -> STARTED
     *
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param workItemContext work item context
     */
    void moveFromOfferedToStarted(WorkItemContext workItemContext, String ownerAccountId);

    /**
     * Move work item list: STARTED -> OFFERED
     *
     * @param workItemContext work item context
     */
    void moveFromStartedToOffered(WorkItemContext workItemContext, String ownerAccountId);

    /**
     * Move work item list: ALLOCATED -> STARTED
     *
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param workItemContext work item context
     */
    void moveFromAllocatedToStarted(WorkItemContext workItemContext, String ownerAccountId);

    /**
     * Move work item list: STARTED -> ALLOCATED
     *
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param workItemContext work item context
     */
    void moveFromStartedToAllocated(WorkItemContext workItemContext, String ownerAccountId);

    /**
     * Move work item list: STARTED -> SUSPENDED
     *
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param workItemContext work item context
     */
    void moveFromStartedToSuspend(WorkItemContext workItemContext, String ownerAccountId);

    /**
     * Move work item list: SUSPENDED -> STARTED
     *
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param workItemContext work item context
     */
    void moveFromSuspendToStarted(WorkItemContext workItemContext, String ownerAccountId);


    /**
     * Add or update a work item to a work item list.
     *
     * @param workItemContext work item context
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param type            work item list type
     */
    void addToWorkItemList(WorkItemContext workItemContext, String ownerAccountId, WorkItemListType type);

    /**
     * Remove a work item from a work item list.
     *
     * @param workItemContext work item context
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param type            work item list type
     */
    void removeFromWorkItemList(WorkItemContext workItemContext, String ownerAccountId, WorkItemListType type);

    /**
     * Get all work item in a work item list.
     *
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param type work item list type
     * @return work item list.
     */
    List<WorkItemContext> getWorkItemListItems(String ownerAccountId, WorkItemListType type);

    /**
     * Get work-listed work item list.
     *
     * @param ownerAccountId  工作项列表所有者账户Id
     * @return work-listed work item list
     */
    List<WorkItemContext> getWorkListedWorkItems(String ownerAccountId);

    /**
     * Check if a work item list is null or empty.
     *
     * @param ownerAccountId  工作项列表所有者账户Id
     * @param type work item list type
     * @return true if work item list is null or empty
     */
    boolean isNullOrEmptyWorkItemList(String ownerAccountId, WorkItemListType type);

    /**
     * Get the work item list reference, if a work item list is null then
     * it will be generated by using {@link WorkItemListService#findByOwnerAccountIdAndType}.
     *
     * @param ownerAccountId owner account id
     * @param type           work item list type
     * @return work item list reference
     */
    WorkItemList getWorkItemList(String ownerAccountId, WorkItemListType type);

}