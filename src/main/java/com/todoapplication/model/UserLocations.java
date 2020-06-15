package com.todoapplication.model;

import com.vladmihalcea.hibernate.type.array.IntArrayType;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "todo", name = "user_locations")
@TypeDefs({
        @TypeDef(
                name = "string-array",
                typeClass = StringArrayType.class
        ),
        @TypeDef(
                name = "int-array",
                typeClass = IntArrayType.class
        )
})
public class UserLocations {


    @Id
    @Column(name = "id")
    private int id;


    @Type(type = "int-array")
    @Column(name = "location_ids", columnDefinition = "integer[]")
    private int[] location_ids;

    public int getId() {
        return id;
    }

    public int[] getLocation_ids() {
        return location_ids;
    }

    public void setLocation_ids(int[] location_ids) {
        this.location_ids = location_ids;
    }

    public void setId(int id) {
        this.id = id;
    }


}
