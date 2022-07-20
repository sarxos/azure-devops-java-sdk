package org.azd.release.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/***
 * Gets and sets the workflow tasks for the deploy phase.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkflowTask {
    /***
     * Gets or sets as the task always run or not.
     */
    @JsonProperty("alwaysRun")
    private boolean alwaysRun;
    /***
     * Gets or sets the task condition.
     */
    @JsonProperty("condition")
    private String condition;
    /***
     * Gets or sets as the task continue run on error or not.
     */
    @JsonProperty("continueOnError")
    private boolean continueOnError;
    /***
     * Gets or sets the task definition type. Example:- 'Agent', DeploymentGroup', 'Server' or 'ServerGate'.
     */
    @JsonProperty("definitionType")
    private String definitionType;
    /***
     * Gets or sets as the task enabled or not.
     */
    @JsonProperty("enabled")
    private boolean enabled;
    /***
     * Gets or sets the task environment variables.
     */
    @JsonProperty("environment")
    private Object environment;
    /***
     * Gets or sets the task inputs.
     */
    @JsonProperty("inputs")
    private Object inputs;
    /***
     * Gets or sets the name of the task.
     */
    @JsonProperty("name")
    private String name;
    /***
     * Gets or sets the task override inputs.
     */
    @JsonProperty("overrideInputs")
    private Object overrideInputs;
    /***
     * Gets or sets the reference name of the task.
     */
    @JsonProperty("refName")
    private String refName;

    /**
     * Gets or sets the task retryCount.
     */
    @JsonProperty("retryCountOnTaskFailure")
    private int retryCountOnTaskFailure;
    /***
     * Gets or sets the ID of the task.
     */
    @JsonProperty("taskId")
    private String taskId;
    /***
     * Gets or sets the task timeout.
     */
    @JsonProperty("timeoutInMinutes")
    private int timeoutInMinutes;
    /***
     * Gets or sets the version of the task.
     */
    @JsonProperty("version")
    private String version;

    public boolean isAlwaysRun() {
        return alwaysRun;
    }

    public void setAlwaysRun(boolean alwaysRun) {
        this.alwaysRun = alwaysRun;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isContinueOnError() {
        return continueOnError;
    }

    public void setContinueOnError(boolean continueOnError) {
        this.continueOnError = continueOnError;
    }

    public String getDefinitionType() {
        return definitionType;
    }

    public void setDefinitionType(String definitionType) {
        this.definitionType = definitionType;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Object getEnvironment() {
        return environment;
    }

    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    public Object getInputs() {
        return inputs;
    }

    public void setInputs(Object inputs) {
        this.inputs = inputs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getOverrideInputs() {
        return overrideInputs;
    }

    public void setOverrideInputs(Object overrideInputs) {
        this.overrideInputs = overrideInputs;
    }

    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public int getTimeoutInMinutes() {
        return timeoutInMinutes;
    }

    public void setTimeoutInMinutes(int timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getRetryCountOnTaskFailure() {
        return retryCountOnTaskFailure;
    }

    public void setRetryCountOnTaskFailure(int retryCountOnTaskFailure) {
        this.retryCountOnTaskFailure = retryCountOnTaskFailure;
    }

    @Override
    public String toString() {
        return "WorkflowTask{" +
                "alwaysRun=" + alwaysRun +
                ", condition='" + condition + '\'' +
                ", continueOnError=" + continueOnError +
                ", definitionType='" + definitionType + '\'' +
                ", enabled=" + enabled +
                ", environment=" + environment +
                ", inputs=" + inputs +
                ", name='" + name + '\'' +
                ", overrideInputs=" + overrideInputs +
                ", refName='" + refName + '\'' +
                ", retryCountOnTaskFailure=" + retryCountOnTaskFailure +
                ", taskId='" + taskId + '\'' +
                ", timeoutInMinutes=" + timeoutInMinutes +
                ", version='" + version + '\'' +
                '}';
    }

}
