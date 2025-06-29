import React from "react";
import { useLocation } from "react-router-dom";

const SearchResults = () => {
  const location = useLocation();
  const { results } = location.state || [];

  return (
    <div className="container">
      <h2>Search Results</h2>
      {(!results || results.length === 0) ? (
        <h3>No matching patients found.</h3>
      ) : (
        <table>
          <thead>
            <tr>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Age</th>
              <th>Gender</th>
              <th>Survey Date</th>
            </tr>
          </thead>
          <tbody>
            {results.map((p, index) => (
              <tr key={index}>
                <td>{p.firstName}</td>
                <td>{p.lastName}</td>
                <td>{p.age}</td>
                <td>{p.gender}</td>
                <td>{p.surveyDate}</td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
};

export default SearchResults;
