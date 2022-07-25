// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceColumnDefinition {
    /**
     * @return JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
     * 
     */
    private String JSONPath;
    /**
     * @return description is a human readable description of this column.
     * 
     */
    private @Nullable String description;
    /**
     * @return format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    private @Nullable String format;
    /**
     * @return name is a human readable name for the column.
     * 
     */
    private String name;
    /**
     * @return priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
     * 
     */
    private @Nullable Integer priority;
    /**
     * @return type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    private String type;

    private CustomResourceColumnDefinition() {}
    /**
     * @return JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each custom resource to produce the value for this column.
     * 
     */
    public String JSONPath() {
        return this.JSONPath;
    }
    /**
     * @return description is a human readable description of this column.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return format is an optional OpenAPI type definition for this column. The &#39;name&#39; format is applied to the primary identifier column to assist in clients identifying column is the resource name. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * @return name is a human readable name for the column.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return priority is an integer defining the relative importance of this column compared to others. Lower numbers are considered higher priority. Columns that may be omitted in limited space scenarios should be given a priority greater than 0.
     * 
     */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return type is an OpenAPI type definition for this column. See https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for details.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceColumnDefinition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String JSONPath;
        private @Nullable String description;
        private @Nullable String format;
        private String name;
        private @Nullable Integer priority;
        private String type;
        public Builder() {}
        public Builder(CustomResourceColumnDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.JSONPath = defaults.JSONPath;
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder JSONPath(String JSONPath) {
            this.JSONPath = Objects.requireNonNull(JSONPath);
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public CustomResourceColumnDefinition build() {
            final var o = new CustomResourceColumnDefinition();
            o.JSONPath = JSONPath;
            o.description = description;
            o.format = format;
            o.name = name;
            o.priority = priority;
            o.type = type;
            return o;
        }
    }
}
