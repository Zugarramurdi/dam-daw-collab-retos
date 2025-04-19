// src/components/CodeViewer.jsx
import React from 'react';
import { Light as SyntaxHighlighter } from 'react-syntax-highlighter';
import { atomOneDark } from 'react-syntax-highlighter/dist/esm/styles/hljs';

// Importa los lenguajes que necesites
import python from 'react-syntax-highlighter/dist/esm/languages/hljs/python';
import javascript from 'react-syntax-highlighter/dist/esm/languages/hljs/javascript';
import java from 'react-syntax-highlighter/dist/esm/languages/hljs/java';
import cpp from 'react-syntax-highlighter/dist/esm/languages/hljs/cpp';

SyntaxHighlighter.registerLanguage('python', python);
SyntaxHighlighter.registerLanguage('javascript', javascript);
SyntaxHighlighter.registerLanguage('java', java);
SyntaxHighlighter.registerLanguage('cpp', cpp);

const langMap = {
    Python: 'python',
    JavaScript: 'javascript',
    Java: 'java',
    'C++': 'cpp',
};

const CodeViewer = ({ code, language }) => {
    return (
        <div className="rounded-xl overflow-hidden">
            <SyntaxHighlighter language={langMap[language]} style={atomOneDark} customStyle={{ padding: '1rem' }}>
                {code}
            </SyntaxHighlighter>
        </div>
    );
};

export default CodeViewer;
