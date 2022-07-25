// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * CustomResourceColumnDefinition specifies a column for server side printing.
 * 
 */
public final class CustomResourceColumnDefinitionPatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceColumnDefinitionPatchArgs Empty = new CustomResourceColumnDefinitionPatchArgs();

    /**
     * description is a human readable description of this column.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return description is a human readable description of this column.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
     * 
     */
    @Import(name="jsonPath")
    private @Nullable Output<String> jsonPath;

    /**
     * @return jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
     * 
     */
    public Optional<Output<String>> jsonPath() {
        return Optional.ofNullable(this.jsonPath);
    }

    /**
     * name is a human readable name for the column.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return name is a human readable name for the column.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private CustomResourceColumnDefinitionPatchArgs() {}

    private CustomResourceColumnDefinitionPatchArgs(CustomResourceColumnDefinitionPatchArgs $) {
        this.description = $.description;
        this.format = $.format;
        this.jsonPath = $.jsonPath;
        this.name = $.name;
        this.priority = $.priority;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomResourceColumnDefinitionPatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomResourceColumnDefinitionPatchArgs $;

        public Builder() {
            $ = new CustomResourceColumnDefinitionPatchArgs();
        }

        public Builder(CustomResourceColumnDefinitionPatchArgs defaults) {
            $ = new CustomResourceColumnDefinitionPatchArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description description is a human readable description of this column.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description description is a human readable description of this column.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param format format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param jsonPath jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
         * 
         * @return builder
         * 
         */
        public Builder jsonPath(@Nullable Output<String> jsonPath) {
            $.jsonPath = jsonPath;
            return this;
        }

        /**
         * @param jsonPath jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
         * 
         * @return builder
         * 
         */
        public Builder jsonPath(String jsonPath) {
            return jsonPath(Output.of(jsonPath));
        }

        /**
         * @param name name is a human readable name for the column.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name name is a human readable name for the column.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param priority priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param type type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public CustomResourceColumnDefinitionPatchArgs build() {
            return $;
        }
    }

}
