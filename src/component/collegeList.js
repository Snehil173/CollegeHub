import React, { useState, useEffect } from 'react';
import  './CollegeList.css'; 
function CollegeList() {
    const [colleges, setColleges] = useState([]);

    useEffect(() => {
        fetch('http://localhost:8080/api/college') 
            .then(response => response.json())
            .then(data => setColleges(data)) 
            .catch(error => console.error("Error fetching data: ", error));
    }, []);  

    return (
        <div>
            <h1>Colleges List</h1>
            <table border="10" cellPadding="10" cellSpacing="1">
                <thead>
                    <tr>
                        <th>College Name</th>
                        <th>Accommodation Type</th>
                        <th>Accommodation Fee</th>
                        <th>Courses</th>
                    </tr>
                </thead>
                <tbody>
                    {colleges.map(college => (
                        <tr key={college.id}>
                            <td>{college.name}</td>
                            <td>{college.accommodationType}</td>
                            <td>{college.accommodationFee}</td>
                            <td>
                                <table border="1" cellPadding="5" cellSpacing="0">
                                    <thead>
                                        <tr>
                                            <th>Course Name</th>
                                            <th>Fee</th>
                                            <th>Duration</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {college.courseFees.map(course => (
                                            <tr key={course.id}>
                                                <td>{course.courseName}</td>
                                                <td>{course.fee}</td>
                                                <td>{course.duration}</td>
                                            </tr>
                                        ))}
                                    </tbody>
                                </table>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}

export default CollegeList;
