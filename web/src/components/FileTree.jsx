import React from 'react';

const FileTree = ({ data, onSelect }) => {
    return (
        <div className="w-64 p-2 border-r border-gray-300">
            {Object.entries(data).map(([language, exercises]) => (
                <div key={language}>
                    <h3 className="font-bold text-lg mt-2">{language}</h3>
                    <ul className="pl-4">
                        {Object.entries(exercises).map(([title, file]) => (
                            <li
                                key={file.filename}
                                className="cursor-pointer hover:underline text-blue-600"
                                onClick={() => onSelect({ language, title, ...file })}
                            >
                                {title}
                            </li>
                        ))}
                    </ul>
                </div>
            ))}
        </div>
    );
};

export default FileTree;
