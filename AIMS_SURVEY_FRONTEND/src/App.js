import React from "react";
import { Routes, Route } from "react-router-dom";
import PatientForm from "./components/PatientForm";
import SurveyForm from "./components/SurveyForm";
import SurveyResult from "./components/SurveyResult";
import SearchForm from "./components/SearchForm";
import SearchResults from "./components/SearchResults";


function App() {
  return (
    <Routes>
      <Route path="/" element={<PatientForm />} />
      <Route path="/survey" element={<SurveyForm />} />
      <Route path="/result" element={<SurveyResult />} />
      <Route path="/search" element={<SearchForm />} />
      <Route path="/search-results" element={<SearchResults />} />
    </Routes>
  );
}

export default App;
